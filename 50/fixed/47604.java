@java.lang.Override
public int compareTo(com.nyancraft.reportrts.data.Comment comment) {
    int id = comment.getId();
    return (this.getId()) - id;
}