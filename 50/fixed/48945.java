@java.lang.Override
public int compareTo(edu.chalmers.zombie.Model.QueueElement otherElement) {
    if (otherElement == null)
        throw new java.lang.NullPointerException("QueueElement: Cannot compare with something that is null");
    
    return java.lang.Double.compare(this.getCost(), otherElement.getCost());
}