public android.os.Bundle getInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if ((card) != null) {
        bundle.putString("card", card.getName().toString());
    }
    bundle.putInt("goldHere", goldHere);
    bundle.putInt("goldEast", goldEast);
    bundle.putInt("goldWest", goldWest);
    return bundle;
}