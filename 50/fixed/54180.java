public me.asaushkin.lambda.Artist copy() {
    return new me.asaushkin.lambda.Artist(name, getMembers().map(me.asaushkin.lambda.Artist::copy).collect(java.util.stream.Collectors.toList()), nationality);
}