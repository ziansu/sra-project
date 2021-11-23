public static controllers.Result inWarenkorb(java.lang.String ausgewaehltesProdukt, java.lang.String menge) {
    java.lang.String username = session("User1");
    if (username != null) {
        Model.sharedInstance.setWarenkorb(ausgewaehltesProdukt, menge, session("UserKundennummer"));
        return ok(warenkorb.render(username, Model.sharedInstance.getWarenkorb(session("UserKundennummer"))));
    }else {
        return redirect("/login");
    }
}