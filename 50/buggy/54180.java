public me.asaushkin.lambda.Artist copy() {
    java.util.List<me.asaushkin.lambda.Artist> members = getMembers().map(me.asaushkin.lambda.Artist::copy).collect(java.util.stream.Collectors.toList());
    return new me.asaushkin.lambda.Artist(name, members, nationality);
}