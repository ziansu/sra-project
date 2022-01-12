@java.lang.Override
public com.webfirmframework.wffweb.wffbm.data.WffBMObject asyncMethod(com.webfirmframework.wffweb.wffbm.data.WffBMObject wffBMObject, com.wffwebdemo.minimalproductionsample.page.layout.Event event) {
    com.webfirmframework.wffweb.tag.repository.TagRepository tagRepository = documentModel.getBrowserPage().getTagRepository();
    com.webfirmframework.wffweb.tag.html.AbstractHtml mainDiv = tagRepository.findTagById("mainDivId");
    if (mainDiv != null) {
        com.wffwebdemo.minimalproductionsample.page.layout.IndexPageLayout.LOGGER.info("SampleTemplate1 appended");
        mainDiv.appendChild(new com.wffwebdemo.minimalproductionsample.page.template.SampleTemplate1(documentModel));
        com.webfirmframework.wffweb.tag.html.TitleTag titleTag = tagRepository.findOneTagAssignableToTag(com.webfirmframework.wffweb.tag.html.TitleTag.class);
        titleTag.addInnerHtml(new com.webfirmframework.wffweb.tag.htmlwff.NoTag(null, "Bootstrap Example | SampleTemplate1"));
    }
    return null;
}