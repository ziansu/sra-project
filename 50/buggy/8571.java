public boolean isAjaxRequest() {
    java.lang.String ajaxHeader = getCurrentRequest().getHeader("X-Requested-With");
    return "XMLHttpRequest".equals(ajaxHeader);
}