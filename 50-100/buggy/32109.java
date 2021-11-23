@java.lang.Override
public int hashCode() {
    int prime = 31;
    int result = 1;
    result = (prime * result) + ((this.getKey()) == null ? 0 : this.getKey().hashCode());
    result = (prime * result) + ((this.getValue()) == null ? 0 : this.getValue().hashCode());
    result = (prime * result) + (this.getDib());
}