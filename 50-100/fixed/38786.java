public com.github.twoleds.configuration.ConfigurationBuilder writeComment(java.lang.String comment) throws java.io.IOException {
    if ((comment.indexOf('\n')) >= 0) {
        for (java.lang.String commentLine : comment.split("\r?\n")) {
            this.writeComment(commentLine);
        }
    }else {
        this.writer.write('#');
        this.writer.write(' ');
        this.writer.write(comment);
        this.writer.write('\n');
    }
    return this;
}