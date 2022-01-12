@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.github.dockerjava.api.model.Frame frame = ((com.github.dockerjava.api.model.Frame) (o));
    return (java.util.Arrays.equals(payload, frame.payload)) && ((streamType) == (frame.streamType));
}