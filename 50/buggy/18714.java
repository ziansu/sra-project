@com.google.api.server.spi.config.ApiMethod(name = "getJokeFromLibrary")
public com.example.Caleb.myapplication.backend.MyBean getJokeFromLibrary() {
    java.lang.String joke = com.example.JokeProvider.getJoke();
    com.example.Caleb.myapplication.backend.MyBean response = new com.example.Caleb.myapplication.backend.MyBean();
    response.setData(joke);
    return response;
}