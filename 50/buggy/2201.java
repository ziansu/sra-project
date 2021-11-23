@org.springframework.web.bind.annotation.RequestMapping(value = "/images/{imageId}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.IMAGE_PNG_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public byte[] returnImage(@org.springframework.web.bind.annotation.PathVariable
int imageId) {
    com.codegroup.challengecloud.model.Image image = imageService.getImage(imageId);
    return image.getData();
}