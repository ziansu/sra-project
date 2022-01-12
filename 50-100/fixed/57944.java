@java.lang.Override
public java.time.Instant unmarshal(java.lang.String dateString) throws java.lang.Exception {
    java.time.Instant result = null;
    if (dateString == null) {
        return null;
    }
    dateString = dateString.trim();
    try {
        result = au.gov.ga.geodesy.igssitelog.util.DateUtil.parse(dateString);
    } catch (au.gov.ga.geodesy.igssitelog.interfaces.xml.MarshallingException e) {
        au.gov.ga.geodesy.igssitelog.support.marshalling.moxy.DateAdapter.log.error((("Failed to unmarshal date '" + dateString) + "; returning null and carrying on"));
    }
    return result;
}