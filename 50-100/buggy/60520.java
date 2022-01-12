@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.String str = "nulll";
            java.lang.System.out.println("here");
            org.json.JSONObject jsonObject = null;
            java.lang.System.out.println("xxx");
            str = in.readUTF();
            java.lang.System.out.println(str);
            java.lang.System.out.println(LoginThread.userAnswer);
            out.writeUTF("Yes");
            java.lang.System.out.println("aici!");
        } catch (java.lang.Exception e) {
            java.lang.System.out.print(e);
        }
    } 
}