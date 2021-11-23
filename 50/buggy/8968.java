@java.lang.Override
public void run() {
    show_alert("Upload Failed", ("Unable to upload file to IRCCloud." + ((this.error) != null ? "\n\n" + (this.error) : "")));
}