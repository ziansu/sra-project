public static void main(java.lang.String[] args) throws java.io.IOException {
    GUI.accounts = new java.util.ArrayList<Account>();
    IO.initAccount(GUI.accounts);
    if (!(GUI.accounts.isEmpty())) {
        GUI.currAccount = GUI.accounts.get(0);
    }
    GUI.GUI();
}