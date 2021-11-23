@org.codehaus.jackson.annotate.JsonIgnore
@javax.persistence.Transient
public by.itechart.flowerty.solr.model.OrderDocument getOrderDocument() {
    if (((((id) == null) || ((customer) == null)) || ((receiver) == null)) || ((deliveryDate) == null)) {
        return null;
    }
    return new by.itechart.flowerty.solr.model.OrderDocument(id.toString(), customer.getFathername(), receiver.getFathername(), deliveryDate.toDate(), customer.getCompany());
}