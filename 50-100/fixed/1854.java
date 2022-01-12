public void setEnterContinueOrExit(java.lang.String enterContinueOrExit) throws java.io.IOException {
    if ((enterContinueOrExit.equals("e")) || (enterContinueOrExit.equals("c"))) {
        this.enterContinueOrExit = enterContinueOrExit;
    }else {
        java.lang.System.out.println("Please, press (c) or (e) key!");
        setEnterContinueOrExit(br.readLine());
    }
}