@org.springframework.web.bind.annotation.RequestMapping(value = "remotes")
public java.util.Collection<com.programyourhome.ir.model.PyhDevice> getRemotes() {
    return this.infraRed.getDevices();
}