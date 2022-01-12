@java.lang.Override
public void execute() throws java.lang.Exception {
    java.lang.System.out.print("");
    java.lang.System.out.flush();
    java.lang.System.out.print(prompt);
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    while (!(isReady(reader.readLine()))) {
        java.lang.System.out.print(prompt);
    } 
}