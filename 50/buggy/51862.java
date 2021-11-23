@java.lang.Override
public org.topbraid.mauiserver.framework.Response doDelete(org.topbraid.mauiserver.framework.Request request) {
    tagger.setVocabulary(null);
    return request.noContent();
}