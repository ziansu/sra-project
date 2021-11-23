@java.lang.Override
@javax.jws.WebMethod
public java.lang.String ComputeSquareArea(java.lang.Double side) {
    return fi.jyu.pservice.Utility.converToXml((side * 4));
}