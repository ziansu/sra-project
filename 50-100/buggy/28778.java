protected void whatDidYouDoKid(com.test.dp.observer.CustomEvent event) {
    if (event.isItGood()) {
        java.lang.System.out.println("Yeeeeeeeeeeeeee, i'm the best!!!!");
        notifyObservers(event);
    }else
        if (event.isItBad()) {
            java.lang.System.out.println("Fuck you, go ahead tell my parents");
            notifyObservers(event);
        }else
            if (event.isItVeryBad()) {
                java.lang.System.out.println(":((");
                notifyObservers(event);
            }else {
                java.lang.System.out.println("Waaaa?");
            }
        
    
}