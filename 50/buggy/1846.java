@java.lang.Override
public void run() {
    java.lang.System.out.println("Deleting initialized!");
    long i = 0;
    boolean flag;
    while (true) {
        flag = executeCleaning();
        if (flag == false) {
            i++;
        }
    } 
}