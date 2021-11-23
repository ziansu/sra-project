@java.lang.Override
public boolean equals(java.lang.Object otherValue) {
    return ((otherValue != null) && (otherValue.getClass().isAssignableFrom(com.aerospike.client.Value.class))) && (((com.aerospike.client.Value) (otherValue)).toString().equals(this.toString()));
}