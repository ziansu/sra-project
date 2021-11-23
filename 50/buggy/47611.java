@org.junit.Test
public void test() {
    org.onetwo.common.apiclient.response.WeatherResponse res = this.weatherClient.getWeather("101010100");
    java.lang.System.out.println(("res: " + res));
    org.assertj.core.api.Assertions.assertThat(res.getWeatherinfo().getCity()).isEqualTo("北京");
}