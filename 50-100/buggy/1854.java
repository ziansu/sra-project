public void setEnterContinueOrExit(java.lang.String enterContinueOrExit) throws java.io.IOException {
    this.enterContinueOrExit = enterContinueOrExit;
    if ((this.enterContinueOrExit.equals("e")) || (this.enterContinueOrExit.equals("c"))) {
        return ;
    }else {
        while ((!(this.enterContinueOrExit.equals("e"))) || (!(this.enterContinueOrExit.equals("c")))) {
            java.lang.System.out.println("Please, press (c) or (e) key!");
            this.enterContinueOrExit = br.readLine();
        } 
    }
}