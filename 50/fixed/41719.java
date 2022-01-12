@org.springframework.web.bind.annotation.PostMapping(value = "uploadGenerator")
public java.lang.String[] uploadGenerator(@org.springframework.web.bind.annotation.RequestBody
de.busybeever.bachelor.presentation.admin.DownloadGenerator data) {
    return adminService.uploadGenerator(data);
}