@java.lang.Override
public void init(java.lang.String[] args) {
    super.init(args);
    this.filePath = args[0];
    if ((args.length) < 2) {
        return ;
    }
    this.length = java.lang.Integer.valueOf(args[1]);
    if ((args.length) >= 3) {
        this.bufferSize = java.lang.Integer.valueOf(args[2]);
    }
}