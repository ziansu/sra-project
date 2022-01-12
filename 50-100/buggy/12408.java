@java.lang.Override
public java.lang.String getAcceptedPath() {
    if (!(this.useEncoding))
        return ("/" + (this.root)) + "/*";
    else
        return (encodeIfNecessary(("/" + (this.root.getName())))) + "*";
    
}