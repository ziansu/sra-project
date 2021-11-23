private me.angrybyte.contactsgenerator.parser.data.Person parsePerson(com.google.gson.JsonObject jsonUser) {
    me.angrybyte.contactsgenerator.parser.data.Person person = new me.angrybyte.contactsgenerator.parser.data.Person();
    java.lang.String gender = uppercaseFirstLetter(jsonUser.get(JsonConstants.GENDER).getAsString());
    person.setGender(gender);
    parseName(person, jsonUser);
    person.setEmail(jsonUser.get(JsonConstants.EMAIL).getAsString());
    person.setPhone(jsonUser.get(JsonConstants.PHONE).getAsString());
    parsePicture(person, jsonUser);
    return person;
}