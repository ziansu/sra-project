private static void sendRequest(int id) {
    java.lang.String request = "20503";
    switch (id) {
        case 200 :
        case 201 :
        case 202 :
        case 203 :
        case 204 :
            request += java.lang.Integer.toString(id);
    }
    try {
        networking.testing.TestUAVClient.out.write(request.toCharArray());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}