public void update() throws java.io.IOException {
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("GB2312");
    if (versionName.equals(updateversion)) {
        java.lang.System.out.println(updateUrl);
        response.getWriter().write(updateUrl);
    }else {
        response.getWriter().write(updateUrl);
    }
}