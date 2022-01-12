@org.junit.Test
public void test() {
    org.onetwo.common.apiclient.response.WeatherResponse res = this.weatherClient.getWeather("101010100");
    org.assertj.core.api.Assertions.assertThat(res.getWeatherinfo().getCity()).isEqualTo("北京");
}