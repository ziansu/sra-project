@hillbillies.model.Basic
@hillbillies.model.Raw
public java.util.Vector getNextPosition() {
    return (this.nextPosition) == null ? null : this.nextPosition.clone();
}