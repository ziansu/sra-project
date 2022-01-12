public static java.lang.Object serve(org.rapidoid.http.HttpExchange x, java.lang.Object view) {
    org.rapidoid.pages.Pages.load(x, view);
    java.lang.Object result = org.rapidoid.pages.Pages.render(x, view);
    x.addToPageStack();
    org.rapidoid.pages.Pages.store(x, view);
    return result;
}