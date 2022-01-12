private static java.lang.String connecte() {
    if (profilGestion.existe()) {
        return source.challenge.LSD.getString("conne_msg1");
    }else {
        return source.challenge.LSD.getString("conne_msg2");
    }
}