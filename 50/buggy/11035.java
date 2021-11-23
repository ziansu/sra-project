@org.apache.tapestry5.annotations.AfterRender
public void afterRender() {
    javaScriptSupport.addScript("$('#beginDate').val('%s');", getFirstRequestDate());
    javaScriptSupport.addScript("var options = document.getElementsByTagName('option');	for(var i = 0; i<options.length;i++){options[i].setAttribute('title', options[i].innerHTML);}");
}