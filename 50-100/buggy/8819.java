@java.lang.Override
public void encodeData(org.mobicents.protocols.asn.AsnOutputStream asnOs) throws org.mobicents.protocols.ss7.cap.api.CAPException {
    if ((this.data) == null)
        throw new org.mobicents.protocols.ss7.cap.api.CAPException("data field must not be null");
    
    if (((this.data.length) < 3) && ((this.data.length) > 11))
        throw new org.mobicents.protocols.ss7.cap.api.CAPException("data field length must be from 3 to 11");
    
    asnOs.writeOctetStringData(data);
}