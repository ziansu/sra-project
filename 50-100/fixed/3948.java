public T create(T resource, edu.psu.swe.scim.spec.protocol.attribute.AttributeReferenceListWrapper attributes, edu.psu.swe.scim.spec.protocol.attribute.AttributeReferenceListWrapper excludedAttributes) throws edu.psu.swe.scim.spec.protocol.exception.ScimException {
    javax.ws.rs.core.Response response = this.scimClient.create(resource, attributes, excludedAttributes);
    T t = edu.psu.swe.scim.client.rest.BaseScimClient.handleResponse(response, scimResourceClass, response::readEntity);
    return t;
}