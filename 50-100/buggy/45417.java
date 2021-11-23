public void run() {
    java.lang.String exactTime;
    java.lang.String incoming;
    try {
        while ((exactTime = input.readLine()) != null) {
            incoming = input.readLine();
            if (exclusiveLines.add(exactTime)) {
                conversation.append((incoming + "\n"));
            }else {
                input.readLine();
            }
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}