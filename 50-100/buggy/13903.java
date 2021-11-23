private void sendResponse(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    response.setContentType("text/html");
    response.setCharacterEncoding("utf-8");
    java.lang.String err = ((java.lang.String) (request.getAttribute("err")));
    java.util.List<com.maggioni.mymemo.model.Memo> memos = getMemos(request);
    response.getOutputStream().print(com.maggioni.mymemo.view.MemoViewRenderer.renderResponse(java.util.Collections.<com.maggioni.mymemo.model.Memo>emptyList(), null));
}