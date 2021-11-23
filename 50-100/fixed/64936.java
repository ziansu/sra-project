public us.dot.its.jpo.ode.traveler.TravelerInformation buildTravelerInformation(us.dot.its.jpo.ode.traveler.TravelerInputData travInputData) throws com.oss.asn1.EncodeFailedException, com.oss.asn1.EncodeNotSupportedException, java.text.ParseException {
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo = new us.dot.its.jpo.ode.traveler.TravelerInformation();
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setMsgCnt(new us.dot.its.jpo.ode.traveler.MsgCount(travInputData.MsgCount));
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setUrlB(new us.dot.its.jpo.ode.traveler.URL_Base(travInputData.urlB));
    us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo.setDataFrames(buildDataFrames(travInputData));
    return us.dot.its.jpo.ode.traveler.TravelerMessageBuilder.travelerInfo;
}