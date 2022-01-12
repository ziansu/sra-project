public static void main(java.lang.String[] args) {
    int times = com.example.javamavenjunithelloworld.HelloApp.DEFAULT_TIMES;
    if ((args.length) >= 1) {
        try {
            times = java.lang.Integer.parseInt(args[0]);
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.exit(com.example.javamavenjunithelloworld.HelloApp.EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD);
        }
    }
    com.example.javamavenjunithelloworld.Hello hi = new com.example.javamavenjunithelloworld.Hello();
    try {
        hi.setTimes(times);
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.exit(com.example.javamavenjunithelloworld.HelloApp.EXIT_STATUS_HELLO_FAILED);
    }
    hi.sayHello(java.lang.System.out);
}