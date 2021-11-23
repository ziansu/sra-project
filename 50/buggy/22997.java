public void addConfig(java.util.ArrayList<mars.client.Module> list) {
    localConfig.setItem(("c" + (java.lang.Integer.toString(addCounter))), listToConfig(list));
    (addCounter)++;
}