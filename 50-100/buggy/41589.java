public static void sendMessage(java.lang.String msg, main.Cart cart) {
    java.util.Set<java.util.Map.Entry<java.lang.String, main.Cart>> cartSet = main.Application.carts.entrySet();
    java.lang.String key = null;
    for (java.util.Map.Entry<java.lang.String, main.Cart> entry : cartSet)
        if ((entry.getValue()) == cart)
            key = entry.getKey();
        
    
    msg.replace("mcn", key);
    main.Application.targetOS.println(msg);
}