@java.lang.Override
public void export(org.magic.api.beans.MagicDeck deck, java.io.File dest) throws java.io.IOException {
    com.google.gson.Gson g = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    java.lang.System.out.println(g.toJson(deck));
}