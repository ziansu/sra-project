@java.lang.Override
public int hashCode() {
    int hashCode = super.hashCode();
    hashCode ^= new java.lang.Integer(threshold_).hashCode();
    hashCode ^= vis.data.model.query.ThresholdTerm.Parameters.class.hashCode();
    return hashCode;
}