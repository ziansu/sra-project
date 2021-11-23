private static void listItems() {
    for (int I = 0; I < (MainGame.items.length); I++) {
        if (((MainGame.itemDescrStrings[I]) != null) && ((MainGame.items[I]) != 0))
            java.lang.System.out.println(((("Item " + (MainGame.items[I])) + ": ") + (MainGame.itemDescrStrings[I])));
        
    }
}