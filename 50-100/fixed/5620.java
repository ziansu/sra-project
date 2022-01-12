public java.lang.String get_response(char inst) {
    java.lang.String resp = "Timeout";
    if (inst == 0) {
        try {
            resp = in.readLine();
            java.lang.System.out.println(resp);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return resp;
}