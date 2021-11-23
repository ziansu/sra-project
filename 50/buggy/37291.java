@org.springframework.beans.factory.annotation.Autowired
@org.springframework.context.annotation.Bean
public com.alexarkhipov.test.NeoVK neoVK(@org.springframework.beans.factory.annotation.Value(value = "${app.vk.url}")
java.lang.String url, @org.springframework.beans.factory.annotation.Value(value = "${app.vk.access_token}")
java.lang.String accesstoken, @org.springframework.beans.factory.annotation.Value(value = "${app.vk.owner_id}")
java.lang.String ownerid, @org.springframework.beans.factory.annotation.Value(value = "${app.vk.services}")
java.lang.String services, @org.springframework.beans.factory.annotation.Value(value = "${neo.test}")
java.lang.Boolean test) {
    return new com.alexarkhipov.test.NeoVK(url, accesstoken, ownerid, test);
}