public static void main(java.lang.String[] args) throws java.io.EOFException, java.io.IOException, java.io.NotSerializableException {
    umsl.AccountArray aa = new umsl.AccountArray();
    java.lang.System.out.println("Is this your first time banking with Sophie Bank? 'yes' or 'no'");
    java.util.Scanner response = new java.util.Scanner(java.lang.System.in);
    java.lang.String answer = response.nextLine();
    double balance = 100;
    if (answer.equalsIgnoreCase("yes")) {
        aa.populateArray();
        aa.readArray();
        aa.selectAccount();
    }else {
        aa.readArray();
        balance = aa.selectAccount();
    }
}