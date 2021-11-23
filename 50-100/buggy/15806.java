public static java.lang.Object serve(org.rapidoid.http.HttpExchange x, java.lang.Object view) {
    org.rapidoid.pages.Pages.load(x, view);
    org.rapidoid.html.TagContext ctx = org.rapidoid.html.Tags.context();
    x.sessionSet(org.rapidoid.pages.Pages.SESSION_CTX, ctx);
    x.addToPageStack();
    java.lang.Object result = org.rapidoid.pages.Pages.render(x, view);
    org.rapidoid.pages.Pages.store(x, view);
    return result;
}