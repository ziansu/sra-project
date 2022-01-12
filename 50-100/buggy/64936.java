public us.dot.its.jpo.ode.traveler.TravelerInformation buildTravelerInformation(us.dot.its.jpo.ode.traveler.TravelerInputData travInputData) throws com.oss.asn1.EncodeFailedException, com.oss.asn1.EncodeNotSupportedException, java.text.ParseException {
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo = new us.dot.its.jpo.ode.traveler.TravelerInformation();
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setMsgCnt(new us.dot.its.jpo.ode.traveler.MsgCount(travInputData.MsgCount));
    java.nio.ByteBuffer buf = java.nio.ByteBuffer.allocate(9).put(((byte) (0))).putLong(travInputData.UniqueMSGID);
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setPacketID(new us.dot.its.jpo.ode.traveler.UniqueMSGID(buf.array()));
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setUrlB(new us.dot.its.jpo.ode.traveler.URL_Base(travInputData.urlB));
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setDataFrames(buildDataFrames(travInputData));
    return us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo;
}