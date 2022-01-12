@org.springframework.context.annotation.Bean
public it.pwned.telegram.bot.api.TelegramBotApi telegramBotApi(@org.springframework.beans.factory.annotation.Value(value = "${bot.token}")
java.lang.String token, org.springframework.web.client.RestTemplate rest) {
    return new it.pwned.telegram.bot.api.rest.TelegramBotRestApi(token, rest);
}