@java.lang.Override
public boolean equals(java.lang.Object otherValue) {
    return ((otherValue != null) && (this.getClass().equals(otherValue.getClass()))) && (((com.aerospike.client.Value) (otherValue)).toString().equals(this.toString()));
}