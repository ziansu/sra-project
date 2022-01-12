@org.springframework.context.annotation.Bean
public com.alliander.osgp.adapter.protocol.iec61850.device.FirmwareLocation firmwareLocation(@org.springframework.beans.factory.annotation.Value(value = "${firmware.protocol}")
final java.lang.String protocol, @org.springframework.beans.factory.annotation.Value(value = "${firmware.domain}")
final java.lang.String domain, @org.springframework.beans.factory.annotation.Value(value = "${firmware.port}")
final int port, @org.springframework.beans.factory.annotation.Value(value = "${firmware.path}")
final java.lang.String path) {
    return new com.alliander.osgp.adapter.protocol.iec61850.device.FirmwareLocation(protocol, domain, port, path);
}